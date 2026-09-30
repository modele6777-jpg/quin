package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j19 {
    public static final j19 b;
    public final List a;

    static {
        new j19(t72.I("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"));
        b = new j19(t72.I("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"));
    }

    public j19(List list) {
        this.a = list;
        if (list.size() != 12) {
            qc0.j("Month names must contain exactly 12 elements");
            throw null;
        }
        Iterator it = t72.B(list).iterator();
        while (((y67) it).c) {
            int iNextInt = ((q67) it).nextInt();
            if (((CharSequence) this.a.get(iNextInt)).length() <= 0) {
                qc0.j("A month name can not be empty");
                throw null;
            }
            for (int i = 0; i < iNextInt; i++) {
                if (pa7.t(this.a.get(iNextInt), this.a.get(i))) {
                    qc0.o(ks0.l(new StringBuilder("Month names must be unique, but '"), (String) this.a.get(iNextInt), "' was repeated"));
                    throw null;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j19) {
            return this.a.equals(((j19) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return s72.D0(this.a, ", ", "MonthNames(", ")", i19.a, 24);
    }
}
