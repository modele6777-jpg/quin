package defpackage;

import android.content.Context;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lj6 {
    public static final isa b = new isa("fire-global");
    public static final isa c = new isa("fire-count");
    public static final isa d = new isa("last-used-date");
    public final fe7 a;

    public lj6(Context context, String str) {
        this.a = new fe7(context, "FirebaseHeartBeat".concat(str));
    }

    public static String b(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public static isa c(p79 p79Var, String str) {
        for (Map.Entry entry : p79Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((isa) entry.getKey()).a;
                        str2.getClass();
                        return new isa(str2);
                    }
                }
            }
        }
        return null;
    }

    public static void d(p79 p79Var, String str) {
        isa isaVarC = c(p79Var, str);
        if (isaVarC == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) hkg.w0(p79Var, isaVarC, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            p79Var.d(isaVarC);
        } else {
            p79Var.f(isaVarC, hashSet);
        }
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            for (Map.Entry entry : ((Map) z5c.I(nu4.a, new be7(this.a, null))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new dp0(((isa) entry.getKey()).a, new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.a.a(new ac(jCurrentTimeMillis, 10));
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized boolean e(isa isaVar, long j) {
        if (b(((Long) this.a.b(isaVar, -1L)).longValue()).equals(b(j))) {
            return false;
        }
        return true;
    }
}
