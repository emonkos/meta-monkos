SUMMARY = "Package group for graphics components"
DESCRIPTION = "Package group for graphics components"

inherit packagegroup

PACKAGES = "\
    packagegroup-monkos-graphics \
    "

RDEPENDS_packagegroup-monkos-graphics = "\
    wayland \
    westeros \
    westeros-simplebuffer \
    westeros-simpleshell \
    westeros-sink \
    ${WESTEROS_SOC} \
    ${WESTEROS_RENDERER} \
    "

WESTEROS_SOC ?= "westeros-soc-drm"

WESTEROS_SOC_rpi = "${@bb.utils.contains("MACHINE_FEATURES", "vc4graphics", "westeros-soc-drm", "westeros-render-dispmanx", d)}"

WESTEROS_RENDERER ?= ""

