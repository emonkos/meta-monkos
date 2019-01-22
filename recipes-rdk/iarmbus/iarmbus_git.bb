SUMMARY = "Library for Inter Process Communication"
SECTION = "rdk"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

DEPENDS = "glib-2.0"
RDEPENDS_${PN} = "dbus glib-2.0"

S = "${WORKDIR}/git"

SRC_URI = "git://github.com/rdkcmf/rdk-iarmbus.git;protocol=http;branch=master"
SRCREV = "6050eda793ad0c7d77c2eee16f620b2d59fa24be"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "file://cfg"

inherit autotools systemd pkgconfig

do_configure_prepend(){
    cp -a ${WORKDIR}/cfg ${S}
}

do_install_append(){
    install -d ${D}${systemd_unitdir}/system
    install -m 0644 ${S}/conf/iarmbusd.service ${D}${systemd_unitdir}/system
}

SYSTEMD_SERVICE_${PN} = "iarmbusd.service"

