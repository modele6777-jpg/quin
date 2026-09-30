package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i60 implements hf8 {
    public final Context a;
    public final t7 b;
    public final nb4 c;
    public final g6b d;
    public final yt6 e;

    public i60(Context context, t7 t7Var, nb4 nb4Var, g6b g6bVar, yt6 yt6Var) {
        this.a = context;
        this.b = t7Var;
        this.c = nb4Var;
        this.d = g6bVar;
        this.e = yt6Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1 A[PHI: r1 r14
  0x00f1: PHI (r1v6 java.util.Set) = (r1v3 java.util.Set), (r1v17 java.util.Set) binds: [B:39:0x00ee, B:21:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x00f1: PHI (r14v18 java.lang.Object) = (r14v11 java.lang.Object), (r14v1 java.lang.Object) binds: [B:39:0x00ee, B:21:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0102  */
    /* JADX WARN: Code duplicated, block: B:53:0x012e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0142  */
    /* JADX WARN: Code duplicated, block: B:66:0x0168  */
    /* JADX WARN: Code duplicated, block: B:70:0x016e  */
    /* JADX WARN: Code duplicated, block: B:72:0x018d  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:78:0x011b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:0x010f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (r14 == r9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b9, code lost:
    
        if (r14 == r9) goto L52;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x0142, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:72:0x018d, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b9 -> B:33:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.zn2 r14) {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i60.a(zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x009c, please report this as an issue */
    public final Object b(String str, xn2 xn2Var) {
        h60 h60Var;
        int iIntValue;
        Object objK;
        String str2;
        int i;
        int iIntValue2;
        if (xn2Var instanceof h60) {
            h60Var = (h60) xn2Var;
            int i2 = h60Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h60Var.label = i2 - Integer.MIN_VALUE;
            } else {
                h60Var = new h60(this, xn2Var);
            }
        } else {
            h60Var = new h60(this, xn2Var);
        }
        Object objK2 = h60Var.result;
        int i3 = h60Var.label;
        int i4 = 24;
        Object obj = bw2.a;
        if (i3 == 0) {
            jzb.q(objK2);
            h60Var.L$0 = str;
            h60Var.label = 1;
            if (a(h60Var) != obj) {
            }
            return obj;
        }
        if (i3 == 1) {
            str = (String) h60Var.L$0;
            jzb.q(objK2);
        } else {
            if (i3 == 2) {
                str = (String) h60Var.L$0;
                jzb.q(objK2);
                iIntValue = ((Number) objK2).intValue();
                h60Var.L$0 = str;
                h60Var.I$0 = iIntValue;
                h60Var.label = 3;
                objK = urg.K(h60Var, new bt5(str, i4), ((n6b) this.d).a, false, true);
                if (objK != obj) {
                    str2 = str;
                    i = iIntValue;
                    objK2 = objK;
                }
                return obj;
            }
            if (i3 != 3) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = h60Var.I$0;
            str2 = (String) h60Var.L$0;
            jzb.q(objK2);
        }
        iIntValue2 = ((Number) objK2).intValue() + i;
        if (iIntValue2 > 0) {
            d().e("Promoted " + iIntValue2 + " anonymous rows to " + str2);
            m8b m8bVar = w28.a;
            w28.a(this.a);
        }
        return wef.a;
        h60Var.L$0 = str;
        h60Var.label = 2;
        objK2 = urg.K(h60Var, new ia(str, i4), ((vb4) this.c).a, false, true);
        if (objK2 != obj) {
            iIntValue = ((Number) objK2).intValue();
            h60Var.L$0 = str;
            h60Var.I$0 = iIntValue;
            h60Var.label = 3;
            objK = urg.K(h60Var, new bt5(str, i4), ((n6b) this.d).a, false, true);
            if (objK != obj) {
                str2 = str;
                i = iIntValue;
                objK2 = objK;
                iIntValue2 = ((Number) objK2).intValue() + i;
                if (iIntValue2 > 0) {
                    d().e("Promoted " + iIntValue2 + " anonymous rows to " + str2);
                    m8b m8bVar2 = w28.a;
                    w28.a(this.a);
                }
                return wef.a;
            }
        }
        return obj;
    }
}
