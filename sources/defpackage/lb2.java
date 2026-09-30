package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lb2 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final bc2 f;
    public final Set g;

    public lb2(String str, Set set, Set set2, int i, int i2, bc2 bc2Var, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = bc2Var;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static kb2 a(y3b y3bVar) {
        return new kb2(y3bVar, new y3b[0]);
    }

    public static kb2 b(Class cls) {
        return new kb2(cls, new Class[0]);
    }

    public static lb2 c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(y3b.a(cls));
        for (Class cls2 : clsArr) {
            tm7.q(cls2, "Null interface");
            hashSet.add(y3b.a(cls2));
        }
        return new lb2(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new jb2(1, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
