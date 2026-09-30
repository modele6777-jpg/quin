package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class m68 implements Iterator {
    public final CharSequence a;
    public q68 b = null;
    public int c = 0;
    public int d = 0;
    public final /* synthetic */ gg7 e;

    public m68(gg7 gg7Var, CharSequence charSequence) {
        this.e = gg7Var;
        this.a = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        hec hecVar;
        if (this.b == null) {
            CharSequence charSequence = this.a;
            int length = charSequence.length();
            while (true) {
                int i = this.c;
                if (i >= length) {
                    break;
                }
                char cCharAt = charSequence.charAt(i);
                gg7 gg7Var = this.e;
                if (cCharAt == ':') {
                    hecVar = (pzd) gg7Var.b;
                } else if (cCharAt == '@') {
                    hecVar = (i8c) gg7Var.d;
                } else if (cCharAt != 'w') {
                    gg7Var.getClass();
                    hecVar = null;
                } else {
                    hecVar = (w1e) gg7Var.c;
                }
                int i2 = this.c;
                if (hecVar != null) {
                    q68 q68VarD = hecVar.d(charSequence, i2, this.d);
                    if (q68VarD != null) {
                        this.b = q68VarD;
                        int i3 = q68VarD.c;
                        this.c = i3;
                        this.d = i3;
                        break;
                    }
                    this.c++;
                } else {
                    this.c = i2 + 1;
                }
            }
        }
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            s8f.c();
            return null;
        }
        q68 q68Var = this.b;
        this.b = null;
        return q68Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
