package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dda {
    public final List a;
    public final List b;
    public final boolean c;

    public dda(List list, List list2, boolean z) {
        list.getClass();
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    public static dda a(dda ddaVar, List list, ArrayList arrayList, boolean z, int i) {
        if ((i & 1) != 0) {
            list = ddaVar.a;
        }
        List list2 = arrayList;
        if ((i & 2) != 0) {
            list2 = ddaVar.b;
        }
        if ((i & 4) != 0) {
            z = ddaVar.c;
        }
        list.getClass();
        list2.getClass();
        return new dda(list, list2, z);
    }

    public final j2a b() {
        List list = this.b;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((TarotCardChoice) it.next()) != null) {
                    if (list == null || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (((TarotCardChoice) it2.next()) == null) {
                                return j2a.b;
                            }
                        }
                    }
                    return j2a.c;
                }
            }
        }
        return j2a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dda)) {
            return false;
        }
        dda ddaVar = (dda) obj;
        return pa7.t(this.a, ddaVar.a) && pa7.t(this.b, ddaVar.b) && this.c == ddaVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + tec.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoPatternUiState(patterns=");
        sb.append(this.a);
        sb.append(", slots=");
        sb.append(this.b);
        sb.append(", hasUsedCamera=");
        return ub3.m(sb, this.c, ")");
    }
}
