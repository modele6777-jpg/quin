package defpackage;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hh7 implements gv4 {
    public static final fh7 f;
    public static final fh7 g;
    public final HashMap a;
    public final HashMap b;
    public final eh7 c;
    public boolean d;
    public static final eh7 e = new eh7(0);
    public static final gh7 h = new gh7();

    /* JADX WARN: Type inference failed for: r0v1, types: [fh7] */
    /* JADX WARN: Type inference failed for: r0v2, types: [fh7] */
    static {
        final int i = 0;
        f = new qrf() { // from class: fh7
            @Override // defpackage.fv4
            public final void encode(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((rrf) obj2).b((String) obj);
                        break;
                    default:
                        ((rrf) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new qrf() { // from class: fh7
            @Override // defpackage.fv4
            public final void encode(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((rrf) obj2).b((String) obj);
                        break;
                    default:
                        ((rrf) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public hh7() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    @Override // defpackage.gv4
    public final gv4 a(Class cls, lk9 lk9Var) {
        this.a.put(cls, lk9Var);
        this.b.remove(cls);
        return this;
    }
}
