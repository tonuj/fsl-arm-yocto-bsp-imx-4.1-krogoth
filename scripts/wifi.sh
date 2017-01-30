#!/bin/sh

wpa_supplicant -B -Dnl80211 -iwlan0 -c/etc/wpa_supplicant.conf
udhcpc -iwlan0
