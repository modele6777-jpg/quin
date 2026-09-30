package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sh3 implements as5 {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public sh3(as5 as5Var, qid qidVar) {
        as5Var.getClass();
        this.b = as5Var;
        this.c = qidVar;
    }

    @Override // defpackage.as5
    public final void a(Object obj, StringBuilder sb, boolean z) {
        int i = this.a;
        boolean z2 = true;
        int i2 = 0;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                int[] iArr = kn2.v;
                int iA = ((rh3) ((w) obj2).d(obj)).a(9);
                while (true) {
                    int i3 = 1 + i2;
                    if (9 > i3 && iA % iArr[i3] == 0) {
                        i2 = i3;
                    }
                }
                int iIntValue = ((Number) ((List) obj3).get(8 - i2)).intValue();
                if (i2 >= iIntValue) {
                    i2 -= iIntValue;
                }
                sb.append((CharSequence) String.valueOf((iA / iArr[i2]) + iArr[9 - i2]).substring(1));
                break;
            default:
                Character ch = (z || !((Boolean) ((qid) obj3).d(obj)).booleanValue()) ? '+' : '-';
                sb.append(ch.charValue());
                as5 as5Var = (as5) obj2;
                if (!z && ch.charValue() != '-') {
                    z2 = false;
                }
                as5Var.a(obj, sb, z2);
                break;
        }
    }

    public sh3(w wVar, List list) {
        this.b = wVar;
        this.c = list;
    }
}
