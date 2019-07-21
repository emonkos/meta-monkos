SUMMARY = "Package group for networking components"
DESCRIPTION = "Package group for networking components"

inherit packagegroup

PACKAGES = "\
    packagegroup-monkos-networking \
    "

RDEPENDS_packagegroup-monkos-networking = "\
    network-hotplug \
    "

RDEPENDS_packagegroup-monkos-networking-debug = "\
    tcpdump \
    "
