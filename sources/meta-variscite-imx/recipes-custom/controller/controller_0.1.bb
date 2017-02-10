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

inherit qmake5


EXTRA_QMAKEVARS_PRE += "target.path=/home/root"
  
#PACKAGES = "${PN}"
FILES_${PN} += "/home/root/Controller"
