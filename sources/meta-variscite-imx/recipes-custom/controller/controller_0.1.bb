#
#@DESCRIPTION: controller program"
#
# http://www.voidpointer.io
# info@voidpointer.io
#
SUMMARY = "Controller"
DESCRIPTION = "Dart streaming controller program"
HOMEPAGE = "http://www.voidpointer.io"
DEPENDS = "qtbase qtserialport"

SRCREV = "${AUTOREV}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README;md5=d41d8cd98f00b204e9800998ecf8427e"
SRC_URI = "git://bitbucket.org/tonu/controller.git;protocol=http"

S = "${WORKDIR}/git"


INITSCRIPT_NAME = "ctr"
INITSCRIPT_PARAMS = "defaults 40"
EXTRA_QMAKEVARS_PRE += "target.path=/home/root"

inherit qmake5 update-rc.d

do_install_append() {
	install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${S}/ctr ${D}${sysconfdir}/init.d/ctr
}
  
#PACKAGES = "${PN}"
FILES_${PN} += "/home/root/Controller"
FILES_${PN} += "${sysconfdir}/init.d/ctr"
