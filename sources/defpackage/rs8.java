package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rs8 implements h1a, te6 {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final qs8 e;

    public rs8(qs8 qs8Var) {
        this.e = qs8Var;
    }

    public final void a(Path.Op op) {
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            h1a h1aVar = (h1a) arrayList.get(size);
            if (h1aVar instanceof km2) {
                km2 km2Var = (km2) h1aVar;
                ArrayList arrayList2 = (ArrayList) km2Var.d();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathE = ((h1a) arrayList2.get(size2)).e();
                    Matrix matrixD = km2Var.d;
                    q2f q2fVar = km2Var.k;
                    if (q2fVar != null) {
                        matrixD = q2fVar.d();
                    } else {
                        matrixD.reset();
                    }
                    pathE.transform(matrixD);
                    path.addPath(pathE);
                }
            } else {
                path.addPath(h1aVar.e());
            }
        }
        int i = 0;
        h1a h1aVar2 = (h1a) arrayList.get(0);
        if (h1aVar2 instanceof km2) {
            km2 km2Var2 = (km2) h1aVar2;
            List listD = km2Var2.d();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listD;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathE2 = ((h1a) arrayList3.get(i)).e();
                Matrix matrixD2 = km2Var2.d;
                q2f q2fVar2 = km2Var2.k;
                if (q2fVar2 != null) {
                    matrixD2 = q2fVar2.d();
                } else {
                    matrixD2.reset();
                }
                pathE2.transform(matrixD2);
                path2.addPath(pathE2);
                i++;
            }
        } else {
            path2.set(h1aVar2.e());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.zl2
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((h1a) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // defpackage.te6
    public final void d(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            zl2 zl2Var = (zl2) listIterator.previous();
            if (zl2Var instanceof h1a) {
                this.d.add((h1a) zl2Var);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.h1a
    public final Path e() {
        Path path = this.c;
        path.reset();
        qs8 qs8Var = this.e;
        if (!qs8Var.b) {
            int iB = kv2.B(qs8Var.a);
            if (iB == 0) {
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((h1a) arrayList.get(i)).e());
                    i++;
                }
            } else {
                if (iB == 1) {
                    a(Path.Op.UNION);
                    return path;
                }
                if (iB == 2) {
                    a(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (iB == 3) {
                    a(Path.Op.INTERSECT);
                    return path;
                }
                if (iB == 4) {
                    a(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
