package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qpd implements qu8 {
    public final ArrayList a;

    public qpd(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((ppd) arrayList.get(0)).b;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((ppd) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                }
                j = ((ppd) arrayList.get(i)).b;
            }
        }
        pa7.A(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qpd.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((qpd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
