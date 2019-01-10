SUMMARY = "Monk OS minimal device boot image"

LICENSE = "CLOSED"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"
IMAGE_ROOTFS_EXTRA_SPACE_append = "${@bb.utils.contains("DISTRO_FEATURES", "systemd", " + 4096", "" ,d)}"

IMAGE_FEATURES += "ssh-server-dropbear splash"

IMAGE_INSTALL += " \
    packagegroup-monkos-base-linux \
    packagegroup-monkos-base-machine \
    "
