package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ui6 extends b0 {
    public final /* synthetic */ int a;
    public final yz0 b;
    public final Object c;

    public ui6() {
        this.a = 1;
        this.b = new i17();
        this.c = new ArrayList();
    }

    @Override // defpackage.b0
    public void a(std stdVar) {
        switch (this.a) {
            case 1:
                ((ArrayList) this.c).add(stdVar.a);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033 A[LOOP:1: B:12:0x002f->B:14:0x0033, LOOP_END] */
    @Override // defpackage.b0
    public void e() {
        int i;
        StringBuilder sb;
        CharSequence charSequence;
        switch (this.a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.c;
                int size = arrayList.size();
                do {
                    size--;
                    if (size >= 0) {
                        charSequence = (CharSequence) arrayList.get(size);
                    }
                    sb = new StringBuilder();
                    for (i = 0; i < size + 1; i++) {
                        sb.append((CharSequence) arrayList.get(i));
                        sb.append('\n');
                    }
                    ((i17) this.b).g = sb.toString();
                    break;
                } while (vfh.O(charSequence, 0, charSequence.length()) == charSequence.length());
                sb = new StringBuilder();
                while (i < size + 1) {
                    sb.append((CharSequence) arrayList.get(i));
                    sb.append('\n');
                }
                ((i17) this.b).g = sb.toString();
                break;
        }
    }

    @Override // defpackage.b0
    public final yz0 f() {
        int i = this.a;
        yz0 yz0Var = this.b;
        switch (i) {
            case 0:
                return (ti6) yz0Var;
            default:
                return (i17) yz0Var;
        }
    }

    @Override // defpackage.b0
    public void i(t37 t37Var) {
        switch (this.a) {
            case 0:
                t37Var.a((mx) this.c, (ti6) this.b);
                break;
        }
    }

    @Override // defpackage.b0
    public final c72 j(hg4 hg4Var) {
        switch (this.a) {
            case 0:
                return null;
            default:
                if (hg4Var.h >= 4) {
                    return new c72(-1, hg4Var.d + 4, false);
                }
                if (hg4Var.i) {
                    return c72.a(hg4Var.f);
                }
                return null;
        }
    }

    public ui6(int i, mx mxVar) {
        this.a = 0;
        ti6 ti6Var = new ti6();
        this.b = ti6Var;
        ti6Var.g = i;
        this.c = mxVar;
    }
}
