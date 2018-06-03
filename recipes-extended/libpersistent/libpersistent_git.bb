SUMMARY = "Recipe for building libpersistent"
DESCRIPTION = "libpersistent library provide a convenient way to store persistent data"
SECTION = "lib"
PR = "r1"
LICENSE = "CLOSE"

SRC_URI ="git://gitlab.com/monkos-utils/libpersistent.git;protocol=https;branch=develop"

S = "${WORKDIR}"

inherit cmake

FILES_${PN} += "${libdir}"
FILES_${PN} += "${bindir}"
