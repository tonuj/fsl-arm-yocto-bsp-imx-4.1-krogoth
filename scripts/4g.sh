#!/bin/sh

# GSM reset
echo 4 > /sys/class/gpio/export
echo out > /sys/class/gpio/gpio4/direction
echo 0 > /sys/class/gpio/gpio4/value

# GSM on off
echo 28 > /sys/class/gpio/export
echo out > /sys/class/gpio/gpio28/direction
echo 0 > /sys/class/gpio/gpio28/value

# POWER on (gsm kill)
echo 144 > /sys/class/gpio/export
echo out > /sys/class/gpio/gpio144/direction
echo 0 > /sys/class/gpio/gpio144/value


echo 1 > /sys/class/gpio/gpio144/value
echo 1 > /sys/class/gpio/gpio4/value
usleep 300000
echo 0 > /sys/class/gpio/gpio4/value
usleep 1000000
echo 1 > /sys/class/gpio/gpio28/value
usleep 1200000
echo 0 > /sys/class/gpio/gpio28/value


sleep 25
qmi-network /dev/cdc-wdm0 start
udhcpc -iwwan0

