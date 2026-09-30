package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sid implements as5 {
    public final /* synthetic */ int a = 1;
    public final int b;
    public final Object c;

    public sid(dne dneVar, int i) {
        this.c = dneVar;
        this.b = i;
        if (i < 0) {
            qc0.o(tec.f(i, "The minimum number of digits (", ") is negative"));
            throw null;
        }
        if (i <= 9) {
            return;
        }
        qc0.o(tec.f(i, "The minimum number of digits (", ") exceeds the length of an Int"));
        throw null;
    }

    @Override // defpackage.as5
    public final void a(Object obj, StringBuilder sb, boolean z) {
        int i = this.a;
        int i2 = 0;
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int[] iArr = kn2.v;
                StringBuilder sb2 = new StringBuilder();
                int iIntValue = ((Number) ((vx7) obj2).d(obj)).intValue();
                if (z && iIntValue < 0) {
                    iIntValue = -iIntValue;
                }
                if (iIntValue >= iArr[4]) {
                    sb2.append('+');
                }
                if (Math.abs(iIntValue) >= iArr[i3 - 1]) {
                    sb2.append(iIntValue);
                } else if (iIntValue >= 0) {
                    sb2.append(iIntValue + iArr[i3]);
                    sb2.deleteCharAt(0).getClass();
                } else {
                    sb2.append(iIntValue - iArr[i3]);
                    sb2.deleteCharAt(1).getClass();
                }
                sb.append((CharSequence) sb2);
                break;
            case 1:
                StringBuilder sb3 = new StringBuilder();
                ((as5) obj2).a(obj, sb3, z);
                String string = sb3.toString();
                int length = i3 - string.length();
                while (i2 < length) {
                    sb.append(' ');
                    i2++;
                }
                sb.append((CharSequence) string);
                break;
            default:
                String strValueOf = String.valueOf(((Number) ((dne) obj2).d(obj)).intValue());
                int length2 = i3 - strValueOf.length();
                while (i2 < length2) {
                    sb.append('0');
                    i2++;
                }
                sb.append((CharSequence) strValueOf);
                break;
        }
    }

    public sid(as5 as5Var, int i) {
        this.c = as5Var;
        this.b = i;
    }

    public sid(vx7 vx7Var, int i) {
        this.c = vx7Var;
        this.b = i;
        if (i < 0) {
            qc0.o(tec.f(i, "The minimum number of digits (", ") is negative"));
            throw null;
        }
        if (i <= 9) {
            return;
        }
        qc0.o(tec.f(i, "The minimum number of digits (", ") exceeds the length of an Int"));
        throw null;
    }
}
