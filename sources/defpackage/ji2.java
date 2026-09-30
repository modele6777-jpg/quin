package defpackage;

import android.os.Bundle;
import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ji2 {
    public static final ct d = ct.d();
    public static volatile ji2 e;
    public final RemoteConfigManager a = RemoteConfigManager.getInstance();
    public xx6 b = new xx6();
    public final m74 c = m74.b();

    public static synchronized ji2 e() {
        try {
            if (e == null) {
                e = new ji2();
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public static boolean k(long j) {
        return j >= 0;
    }

    public static boolean l(String str) {
        if (!str.trim().isEmpty()) {
            for (String str2 : str.split(";")) {
                if (str2.trim().equals("22.0.6")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(long j) {
        return j >= 0;
    }

    public static boolean o(double d2) {
        return 0.0d <= d2 && d2 <= 1.0d;
    }

    public final ur9 a(db6 db6Var) {
        m74 m74Var = this.c;
        String strM = db6Var.M();
        if (strM == null) {
            m74Var.getClass();
            m74.c.a("Key is null when getting boolean value on device cache.");
            return new ur9();
        }
        if (m74Var.a == null) {
            m74Var.c(m74.a());
            if (m74Var.a == null) {
                return new ur9();
            }
        }
        if (!m74Var.a.contains(strM)) {
            return new ur9();
        }
        try {
            return new ur9(Boolean.valueOf(m74Var.a.getBoolean(strM, false)));
        } catch (ClassCastException e2) {
            m74.c.b("Key %s from sharedPreferences has type other than long: %s", strM, e2.getMessage());
            return new ur9();
        }
    }

    public final ur9 b(db6 db6Var) {
        m74 m74Var = this.c;
        String strM = db6Var.M();
        if (strM == null) {
            m74Var.getClass();
            m74.c.a("Key is null when getting double value on device cache.");
            return new ur9();
        }
        if (m74Var.a == null) {
            m74Var.c(m74.a());
            if (m74Var.a == null) {
                return new ur9();
            }
        }
        if (!m74Var.a.contains(strM)) {
            return new ur9();
        }
        try {
            try {
                return new ur9(Double.valueOf(Double.longBitsToDouble(m74Var.a.getLong(strM, 0L))));
            } catch (ClassCastException unused) {
                return new ur9(Double.valueOf(Float.valueOf(m74Var.a.getFloat(strM, 0.0f)).doubleValue()));
            }
        } catch (ClassCastException e2) {
            m74.c.b("Key %s from sharedPreferences has type other than double: %s", strM, e2.getMessage());
            return new ur9();
        }
    }

    public final ur9 c(db6 db6Var) {
        m74 m74Var = this.c;
        String strM = db6Var.M();
        if (strM == null) {
            m74Var.getClass();
            m74.c.a("Key is null when getting long value on device cache.");
            return new ur9();
        }
        if (m74Var.a == null) {
            m74Var.c(m74.a());
            if (m74Var.a == null) {
                return new ur9();
            }
        }
        if (!m74Var.a.contains(strM)) {
            return new ur9();
        }
        try {
            return new ur9(Long.valueOf(m74Var.a.getLong(strM, 0L)));
        } catch (ClassCastException e2) {
            m74.c.b("Key %s from sharedPreferences has type other than long: %s", strM, e2.getMessage());
            return new ur9();
        }
    }

    public final ur9 d(db6 db6Var) {
        m74 m74Var = this.c;
        String strM = db6Var.M();
        if (strM == null) {
            m74Var.getClass();
            m74.c.a("Key is null when getting String value on device cache.");
            return new ur9();
        }
        if (m74Var.a == null) {
            m74Var.c(m74.a());
            if (m74Var.a == null) {
                return new ur9();
            }
        }
        if (!m74Var.a.contains(strM)) {
            return new ur9();
        }
        try {
            return new ur9(m74Var.a.getString(strM, ""));
        } catch (ClassCastException e2) {
            m74.c.b("Key %s from sharedPreferences has type other than String: %s", strM, e2.getMessage());
            return new ur9();
        }
    }

    public final Boolean f() {
        ti2 ti2Var;
        ui2 ui2Var;
        synchronized (ti2.class) {
            ti2Var = ti2.l;
            if (ti2Var == null) {
                ti2Var = new ti2();
                ti2.l = ti2Var;
            }
        }
        ur9 ur9VarG = g(ti2Var);
        if ((ur9VarG.b() ? (Boolean) ur9VarG.a() : Boolean.FALSE).booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (ui2.class) {
            ui2Var = ui2.l;
            if (ui2Var == null) {
                ui2Var = new ui2();
                ui2.l = ui2Var;
            }
        }
        ur9 ur9VarA = a(ui2Var);
        if (ur9VarA.b()) {
            return (Boolean) ur9VarA.a();
        }
        ur9 ur9VarG2 = g(ui2Var);
        if (ur9VarG2.b()) {
            return (Boolean) ur9VarG2.a();
        }
        return null;
    }

    public final ur9 g(db6 db6Var) {
        Bundle bundle = this.b.a;
        String strP = db6Var.P();
        if (strP == null || !bundle.containsKey(strP)) {
            return new ur9();
        }
        try {
            Boolean bool = (Boolean) bundle.get(strP);
            return bool == null ? new ur9() : new ur9(bool);
        } catch (ClassCastException e2) {
            xx6.b.b("Metadata key %s contains type other than boolean: %s", strP, e2.getMessage());
            return new ur9();
        }
    }

    public final ur9 h(db6 db6Var) {
        Bundle bundle = this.b.a;
        String strP = db6Var.P();
        if (strP == null || !bundle.containsKey(strP)) {
            return new ur9();
        }
        Object obj = bundle.get(strP);
        if (obj == null) {
            return new ur9();
        }
        if (obj instanceof Float) {
            return new ur9(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return new ur9((Double) obj);
        }
        xx6.b.b("Metadata key %s contains type other than double: %s", strP);
        return new ur9();
    }

    public final ur9 i(db6 db6Var) {
        ur9 ur9Var;
        Bundle bundle = this.b.a;
        String strP = db6Var.P();
        if (strP == null || !bundle.containsKey(strP)) {
            ur9Var = new ur9();
        } else {
            try {
                Integer num = (Integer) bundle.get(strP);
                ur9Var = num == null ? new ur9() : new ur9(num);
            } catch (ClassCastException e2) {
                xx6.b.b("Metadata key %s contains type other than int: %s", strP, e2.getMessage());
                ur9Var = new ur9();
            }
        }
        return ur9Var.b() ? new ur9(Long.valueOf(((Integer) ur9Var.a()).intValue())) : new ur9();
    }

    public final long j() {
        cj2 cj2Var;
        synchronized (cj2.class) {
            cj2Var = cj2.l;
            if (cj2Var == null) {
                cj2Var = new cj2();
                cj2.l = cj2Var;
            }
        }
        ur9 ur9Var = this.a.getLong("fpr_rl_time_limit_sec");
        if (ur9Var.b() && ((Long) ur9Var.a()).longValue() > 0) {
            this.c.d(((Long) ur9Var.a()).longValue(), "com.google.firebase.perf.TimeLimitSec");
            return ((Long) ur9Var.a()).longValue();
        }
        ur9 ur9VarC = c(cj2Var);
        if (!ur9VarC.b() || ((Long) ur9VarC.a()).longValue() <= 0) {
            return 600L;
        }
        return ((Long) ur9VarC.a()).longValue();
    }

    public final boolean n() {
        ej2 ej2Var;
        boolean zBooleanValue;
        dj2 dj2Var;
        boolean zL;
        Boolean boolF = f();
        if (boolF == null || boolF.booleanValue()) {
            synchronized (ej2.class) {
                ej2Var = ej2.l;
                if (ej2Var == null) {
                    ej2Var = new ej2();
                    ej2.l = ej2Var;
                }
            }
            ur9 ur9VarA = a(ej2Var);
            ur9 ur9Var = this.a.getBoolean("fpr_enabled");
            if (!ur9Var.b()) {
                zBooleanValue = ur9VarA.b() ? ((Boolean) ur9VarA.a()).booleanValue() : true;
            } else if (this.a.isLastFetchFailed()) {
                zBooleanValue = false;
            } else {
                Boolean bool = (Boolean) ur9Var.a();
                if (!ur9VarA.b() || ur9VarA.a() != bool) {
                    this.c.g("com.google.firebase.perf.SdkEnabled", bool.booleanValue());
                }
                zBooleanValue = bool.booleanValue();
            }
            if (zBooleanValue) {
                synchronized (dj2.class) {
                    dj2Var = dj2.l;
                    if (dj2Var == null) {
                        dj2Var = new dj2();
                        dj2.l = dj2Var;
                    }
                }
                ur9 ur9VarD = d(dj2Var);
                ur9 string = this.a.getString("fpr_disabled_android_versions");
                if (string.b()) {
                    String str = (String) string.a();
                    if (!ur9VarD.b() || !((String) ur9VarD.a()).equals(str)) {
                        this.c.f("com.google.firebase.perf.SdkDisabledVersions", str);
                    }
                    zL = l(str);
                } else {
                    zL = ur9VarD.b() ? l((String) ur9VarD.a()) : l("");
                }
                if (!zL) {
                    return true;
                }
            }
        }
        return false;
    }
}
