SUMMARY = "Minimal boot requirements for Monk OS"
DESCRIPTION = "Package group for basic components"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

#
# Set by the machine configuration with packages essential for device bootup
#
MACHINE_ESSENTIAL_EXTRA_RDEPENDS ?= ""
MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS ?= ""

VIRTUAL-RUNTIME_dev_manager ?= "systemd"
VIRTUAL-RUNTIME_login_manager ?= ""
VIRTUAL-RUNTIME_init_manager ?= "systemd"
VIRTUAL-RUNTIME_initscripts ?= ""
VIRTUAL-RUNTIME_keymaps ?= "keymaps"


PACKAGES = "\
    packagegroup-monkos-base-linux \
    packagegroup-monkos-base-machine \
    "

RDEPENDS_packagegroup-monkos-base-linux = "\
    base-files \
    base-passwd \
    ${VIRTUAL-RUNTIME_base-utils} \
    netbase \
    ${VIRTUAL-RUNTIME_login_manager} \
    ${VIRTUAL-RUNTIME_init_manager} \
    ${VIRTUAL-RUNTIME_dev_manager} \
    ${VIRTUAL-RUNTIME_update-alternatives} \
    ${MACHINE_ESSENTIAL_EXTRA_RDEPENDS} \
    "

RRECOMMENDS_packagegroup-monkos-base-machine = "\
    ${MACHINE_ESSENTIAL_EXTRA_RRECOMMENDS} \
    "
