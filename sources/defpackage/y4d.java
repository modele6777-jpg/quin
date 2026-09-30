package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y4d implements h1a, zt0, zl2 {
    public final boolean b;
    public final oi8 c;
    public final h5d d;
    public boolean e;
    public final Path a = new Path();
    public final mx f = new mx(2, false);

    public y4d(oi8 oi8Var, eu0 eu0Var, k5d k5dVar) {
        this.b = k5dVar.d;
        this.c = oi8Var;
        h5d h5dVar = new h5d((List) k5dVar.c.b);
        this.d = h5dVar;
        eu0Var.d(h5dVar);
        h5dVar.a(this);
    }

    @Override // defpackage.zt0
    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d A[SYNTHETIC] */
    @Override // defpackage.zl2
    public final void b(List list, List list2) {
        ArrayList arrayList = null;
        int i = 0;
        while (true) {
            ArrayList arrayList2 = (ArrayList) list;
            if (i >= arrayList2.size()) {
                this.d.j = arrayList;
                return;
            }
            zl2 zl2Var = (zl2) arrayList2.get(i);
            if (zl2Var instanceof k5f) {
                k5f k5fVar = (k5f) zl2Var;
                if (k5fVar.c == 1) {
                    this.f.a.add(k5fVar);
                    k5fVar.d(this);
                } else if (!(zl2Var instanceof c7c)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    c7c c7cVar = (c7c) zl2Var;
                    c7cVar.b.a(this);
                    arrayList.add(c7cVar);
                }
            } else if (!(zl2Var instanceof c7c)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                c7c c7cVar2 = (c7c) zl2Var;
                c7cVar2.b.a(this);
                arrayList.add(c7cVar2);
            }
            i++;
        }
    }

    @Override // defpackage.h1a
    public final Path e() {
        boolean z = this.e;
        h5d h5dVar = this.d;
        Path path = this.a;
        if (z) {
            h5dVar.getClass();
            return path;
        }
        path.reset();
        if (this.b) {
            this.e = true;
            return path;
        }
        Path path2 = (Path) h5dVar.d();
        if (path2 == null) {
            return path;
        }
        path.set(path2);
        path.setFillType(Path.FillType.EVEN_ODD);
        this.f.d(path);
        this.e = true;
        return path;
    }
}
