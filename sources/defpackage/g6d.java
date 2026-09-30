package defpackage;

import android.graphics.Bitmap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g6d {
    public final LinkedHashMap a = new LinkedHashMap();
    public final IdentityHashMap b = new IdentityHashMap();
    public boolean c;

    public final f6d a(Integer num) {
        e6d e6dVar;
        if (this.c || (e6dVar = (e6d) this.a.get(num)) == null) {
            return null;
        }
        e6dVar.c++;
        return new f6d(e6dVar.a, new ykc(7, this, e6dVar));
    }

    public final void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        LinkedHashMap linkedHashMap = this.a;
        for (e6d e6dVar : linkedHashMap.values()) {
            int i = e6dVar.b - 1;
            e6dVar.b = i;
            Bitmap bitmap = e6dVar.a;
            if (i == 0 && e6dVar.c == 0) {
                this.b.remove(bitmap);
                jzb.m(bitmap);
            }
        }
        linkedHashMap.clear();
    }

    public final void c(Object obj, Bitmap bitmap) {
        if (this.c) {
            jzb.m(bitmap);
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        e6d e6dVar = (e6d) linkedHashMap.get(obj);
        if ((e6dVar != null ? e6dVar.a : null) == bitmap) {
            return;
        }
        IdentityHashMap identityHashMap = this.b;
        e6d e6dVar2 = (e6d) identityHashMap.get(bitmap);
        if (e6dVar2 == null) {
            e6dVar2 = new e6d(bitmap);
            identityHashMap.put(bitmap, e6dVar2);
        }
        e6dVar2.b++;
        linkedHashMap.put(obj, e6dVar2);
        if (e6dVar != null) {
            int i = e6dVar.b - 1;
            e6dVar.b = i;
            Bitmap bitmap2 = e6dVar.a;
            if (i == 0 && e6dVar.c == 0) {
                identityHashMap.remove(bitmap2);
                jzb.m(bitmap2);
            }
        }
    }
}
