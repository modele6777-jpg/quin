package defpackage;

import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fyd implements pw3 {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public fyd(char c) {
        this.a = c;
    }

    @Override // defpackage.pw3
    public final int a(ow3 ow3Var, ow3 ow3Var2) {
        int size = ow3Var.a.size();
        LinkedList<pw3> linkedList = this.c;
        for (pw3 pw3Var : linkedList) {
            if (pw3Var.c() <= size) {
                return pw3Var.a(ow3Var, ow3Var2);
            }
        }
        pw3Var = (pw3) linkedList.getFirst();
        return pw3Var.a(ow3Var, ow3Var2);
    }

    @Override // defpackage.pw3
    public final char b() {
        return this.a;
    }

    @Override // defpackage.pw3
    public final int c() {
        return this.b;
    }

    @Override // defpackage.pw3
    public final char d() {
        return this.a;
    }

    public final void e(pw3 pw3Var) {
        int iC = pw3Var.c();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            pw3 pw3Var2 = (pw3) listIterator.next();
            int iC2 = pw3Var2.c();
            if (iC > iC2) {
                listIterator.previous();
                listIterator.add(pw3Var);
                return;
            } else if (iC == iC2) {
                String strValueOf = String.valueOf(pw3Var2);
                String strValueOf2 = String.valueOf(pw3Var);
                StringBuilder sb = new StringBuilder("Cannot add two delimiter processors for char '");
                sb.append(this.a);
                sb.append("' and minimum length ");
                sb.append(iC);
                sb.append("; conflicting processors: ");
                qc0.j(ib8.m(sb, strValueOf, ", ", strValueOf2));
                return;
            }
        }
        linkedList.add(pw3Var);
        this.b = iC;
    }
}
