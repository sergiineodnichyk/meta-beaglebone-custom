SUMMARY = "Beaglebone minimal image"
DESCRIPTION = "Base this image on core-image-minimal"

LICENSE = "MIT"

include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += " \
    kernel-modules \
    can-utils \
    "

inherit extrausers
EXTRA_USERS_PARAMS += " \
    usermod -P beaglebone root; \
    "

