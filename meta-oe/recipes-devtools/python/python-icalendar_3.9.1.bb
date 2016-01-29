SUMMARY = "The icalendar package is a parser/generator of iCalendar files for use with Python."
HOMEPAGE = "http://icalendar.readthedocs.org"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=8ff644958c37784425f321ace93fb329"

PR = "r19"

DEPENDS_${PN} = "python-pytz python-dateutil"
RDEPENDS_${PN} = "python-pytz python-dateutil"

SRC_URI = "https://pypi.python.org/packages/source/i/icalendar/icalendar-${PV}.tar.gz"

SRC_URI[md5sum] = "e16251e71dd417b6ede1207fbea67f4c"
SRC_URI[sha256sum] = "d8e05184f943713cbd56e7f1bb122b9befa3fd1e175eaef72abecb21db67193a"

S = "${WORKDIR}/icalendar-${PV}"

inherit setuptools

include python-package-split.inc
