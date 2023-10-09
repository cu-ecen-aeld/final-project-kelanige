DESCRIPTION = "Interface for GPIO control for the Raspberry Pi 4"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://git@github.com/kelanige/rpi-gpio-kernel-module.git;protocol=ssh;branch=main"
PV = "1.0+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

FILES:${PN} += "${bindir}/gpio"

do_configure () {
    :
}

do_compile () {
    oe_runmake
}

do_install () {
    :
}
