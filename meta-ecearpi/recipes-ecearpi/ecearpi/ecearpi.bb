# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://git@github.com/kelanige/rpi-gpio-kernel-module.git;protocol=ssh;branch=main"

# Modify these as desired
PV = "1.0+git${SRCPV}"
# TODO: investigate why floating revisions do not work.
# SRCREV = "${AUTOREV}"
SRCREV = "f42eb5b7a14d419d6e374ade7ce2d3f53eec843c"

S = "${WORKDIR}/git"

inherit module

EXTRA_OEMAKE:append:task-install = " -C ${STAGING_KERNEL_DIR} M=${S}"
EXTRA_OEMAKE += "KERNELDIR=${STAGING_KERNEL_DIR}"

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
