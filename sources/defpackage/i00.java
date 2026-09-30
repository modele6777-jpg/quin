package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i00 implements Appendable {
    public final StringBuilder a;
    public final ArrayList b;
    public final ArrayList c;

    public i00(int i) {
        this.a = new StringBuilder(i);
        this.b = new ArrayList();
        this.c = new ArrayList();
        new ArrayList();
    }

    public final void a(k68 k68Var, int i, int i2) {
        this.c.add(new h00(i, i2, 8, k68Var, null));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence instanceof k00) {
            c(i, i2, (k00) charSequence);
            return this;
        }
        this.a.append(charSequence, i, i2);
        return this;
    }

    public final void b(xtd xtdVar, int i, int i2) {
        this.c.add(new h00(i, i2, 8, xtdVar, null));
    }

    public final void c(int i, int i2, k00 k00Var) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append((CharSequence) k00Var.b, i, i2);
        List listA = l00.a(k00Var, i, i2, null);
        if (listA != null) {
            int size = listA.size();
            for (int i3 = 0; i3 < size; i3++) {
                j00 j00Var = (j00) listA.get(i3);
                this.c.add(new h00(j00Var.a, j00Var.b + length, j00Var.c + length, j00Var.d));
            }
        }
    }

    public final void d(k00 k00Var) {
        StringBuilder sb = this.a;
        int length = sb.length();
        sb.append(k00Var.b);
        List list = k00Var.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                j00 j00Var = (j00) list.get(i);
                this.c.add(new h00(j00Var.a, j00Var.b + length, j00Var.c + length, j00Var.d));
            }
        }
    }

    public final void e(CharSequence charSequence) {
        if (charSequence instanceof k00) {
            d((k00) charSequence);
        } else {
            this.a.append(charSequence);
        }
    }

    public final void f(String str) {
        this.a.append(str);
    }

    public final void g() {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            j37.c("Nothing to pop.");
        }
        ((h00) arrayList.remove(arrayList.size() - 1)).c = this.a.length();
    }

    public final void h(int i) {
        ArrayList arrayList = this.b;
        if (i >= arrayList.size()) {
            j37.c(i + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i) {
            g();
        }
    }

    public final int i(k68 k68Var) {
        h00 h00Var = new h00(this.a.length(), 0, 12, k68Var, null);
        ArrayList arrayList = this.b;
        arrayList.add(h00Var);
        this.c.add(h00Var);
        return arrayList.size() - 1;
    }

    public final int j(String str, String str2) {
        h00 h00Var = new h00(this.a.length(), 0, 4, new m4e(str2), str);
        ArrayList arrayList = this.b;
        arrayList.add(h00Var);
        this.c.add(h00Var);
        return arrayList.size() - 1;
    }

    public final int k(xtd xtdVar) {
        h00 h00Var = new h00(this.a.length(), 0, 12, xtdVar, null);
        ArrayList arrayList = this.b;
        arrayList.add(h00Var);
        this.c.add(h00Var);
        return arrayList.size() - 1;
    }

    public final k00 l() {
        StringBuilder sb = this.a;
        String string = sb.toString();
        ArrayList arrayList = this.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((h00) arrayList.get(i)).a(sb.length()));
        }
        return new k00(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.a.append(c);
        return this;
    }

    public /* synthetic */ i00() {
        this(16);
    }

    public i00(k00 k00Var) {
        this();
        d(k00Var);
    }
}
