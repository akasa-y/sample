DESCRIPTION = "AutoExecScript.sh install"
SUMMARY = ""
SECTION = "ORIGIN"
LICENSE = "CLOSED"
PR = "r0"

inherit autotools update-rc.d

RDEPENDS_${PN} = "initscripts"

SRC_URI += " \
file://AutoExecScript.sh \
"

INITSCRIPT_PACKAGES = "autoexecscript"
INITSCRIPT_NAME_autoexecscript = "AutoExecScript.sh"
INITSCRIPT_PARAMS_autoexecscript = "defaults 90"

do_compile() {
:
}

pkg_postinst_ontarget_${PN}() {
:
}

do_install() {
install -d ${D}${sysconfdir}/init.d
install -m 0755 "${WORKDIR}/AutoExecScript.sh" "${D}${sysconfdir}/init.d/AutoExecScript.sh"
}

PACKAGES = "autoexecscript"
FILES_${PN} += "${sysconfdir}/init.d/AutoExecScript.sh"

