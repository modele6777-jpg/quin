package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class du3 {
    public final String a;
    public final kb6 b;

    public du3(Set set, kb6 kb6Var) {
        this.a = b(set);
        this.b = kb6Var;
    }

    public static String b(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jp0 jp0Var = (jp0) it.next();
            sb.append(jp0Var.a);
            sb.append('/');
            sb.append(jp0Var.b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        kb6 kb6Var = this.b;
        synchronized (((HashSet) kb6Var.b)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) kb6Var.b);
        }
        boolean zIsEmpty = setUnmodifiableSet.isEmpty();
        String str = this.a;
        if (zIsEmpty) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(' ');
        synchronized (((HashSet) kb6Var.b)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) kb6Var.b);
        }
        sb.append(b(setUnmodifiableSet2));
        return sb.toString();
    }
}
