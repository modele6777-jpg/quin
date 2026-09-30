package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bzf implements qu8 {
    public final String a;
    public final String b;

    public bzf(String str, String str2) {
        this.a = bm8.c0(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.qu8
    public final void b(r23 r23Var) {
        String str = this.a;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 905239725:
                if (str.equals("DISCSUBTITLE")) {
                    b = 7;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 8;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 9;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 10;
                }
                break;
        }
        String str2 = this.b;
        switch (b) {
            case 0:
                Integer numA0 = rxg.a0(str2);
                if (numA0 != null) {
                    r23Var.i = numA0;
                }
                break;
            case 1:
                Integer numA1 = rxg.a0(str2);
                if (numA1 != null) {
                    r23Var.w = numA1;
                }
                break;
            case 2:
                Integer numA2 = rxg.a0(str2);
                if (numA2 != null) {
                    r23Var.h = numA2;
                }
                break;
            case 3:
                r23Var.c = str2;
                break;
            case 4:
                r23Var.x = str2;
                break;
            case 5:
                r23Var.a = str2;
                break;
            case 6:
                r23Var.e = str2;
                break;
            case 7:
                r23Var.u = str2;
                break;
            case 8:
                Integer numA3 = rxg.a0(str2);
                if (numA3 != null) {
                    r23Var.v = numA3;
                }
                break;
            case 9:
                r23Var.d = str2;
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                r23Var.b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bzf.class == obj.getClass()) {
            bzf bzfVar = (bzf) obj;
            if (this.a.equals(bzfVar.a) && this.b.equals(bzfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ub3.c(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
