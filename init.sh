#!/bin/sh
cp local.conf build_fb/conf/local.conf
MACHINE=var-som-mx6 DISTRO=fsl-imx-fb source var-setup-release.sh -b build_fb

echo "bitbake fsl-image-qt5"
