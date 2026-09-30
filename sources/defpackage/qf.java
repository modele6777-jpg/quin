package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qf {
    public static final qf c = new qf(new of[0]);
    public static final of d;
    public final int a;
    public final of[] b;

    static {
        of ofVar = new of(-1, new int[0], new op8[0], new long[0], new String[0], new pf[0]);
        int[] iArr = ofVar.d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = ofVar.e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        op8[] op8VarArr = (op8[]) Arrays.copyOf(ofVar.c, 0);
        String[] strArr = (String[]) Arrays.copyOf(ofVar.f, 0);
        pf[] pfVarArr = ofVar.g;
        d = new of(0, iArrCopyOf, op8VarArr, jArrCopyOf, strArr, (pf[]) Arrays.copyOf(pfVarArr, Math.max(0, pfVarArr.length)));
        pqf.D(1);
        pqf.D(2);
        pqf.D(3);
        pqf.D(4);
    }

    public qf(of[] ofVarArr) {
        this.a = ofVarArr.length;
        this.b = ofVarArr;
    }

    public final of a(int i) {
        return i < 0 ? d : this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qf.class != obj.getClass()) {
            return false;
        }
        qf qfVar = (qf) obj;
        return this.a == qfVar.a && Arrays.equals(this.b, qfVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((this.a * 29791) + 1) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            of[] ofVarArr = this.b;
            if (i >= ofVarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=0, contentResumeOffsetUs=0, ads=[");
            ofVarArr[i].getClass();
            ofVarArr[i].getClass();
            for (int i2 = 0; i2 < ofVarArr[i].d.length; i2++) {
                sb.append("ad(state=");
                int i3 = ofVarArr[i].d[i2];
                if (i3 == 0) {
                    sb.append('_');
                } else if (i3 == 1) {
                    sb.append('R');
                } else if (i3 == 2) {
                    sb.append('S');
                } else if (i3 == 3) {
                    sb.append('P');
                } else if (i3 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(ofVarArr[i].e[i2]);
                sb.append(')');
                if (i2 < ofVarArr[i].d.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i < ofVarArr.length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
