# Adapted from linux-imx.inc, copyright (C) 2013, 2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc
require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for Boundary Devices boards"

SRC_URI = "git://github.com/boundarydevices/linux-imx6.git;branch=${SRCBRANCH} \
           file://defconfig \
"

LOCALVERSION = "-1.0.0_ga+yocto"
SRCBRANCH = "boundary-imx_4.1.15_1.0.0_ga"
SRCREV = "76c24a0cde0d50fc8006b15db94f9c3efc5ec979"
DEPENDS += "lzop-native bc-native"
COMPATIBLE_MACHINE = "(nitrogen6x|nitrogen6x-lite|nitrogen6sx|nitrogen7)"
