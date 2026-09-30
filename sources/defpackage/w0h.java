package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0h extends g5h {
    public final tz0 X;
    public final tz0 Y;
    public final tz0 Z;
    public char d;
    public long e;
    public String f;
    public final tz0 g;
    public final tz0 v;
    public final tz0 w;
    public final tz0 x;
    public final tz0 y;
    public final tz0 z;

    public w0h(w3h w3hVar) {
        super(w3hVar);
        this.d = (char) 0;
        this.e = -1L;
        this.g = new tz0(6, this, false, false);
        this.v = new tz0(6, this, true, false);
        this.w = new tz0(6, this, false, true);
        this.x = new tz0(5, this, false, false);
        this.y = new tz0(5, this, true, false);
        this.z = new tz0(5, this, false, true);
        this.X = new tz0(4, this, false, false);
        this.Y = new tz0(3, this, false, false);
        this.Z = new tz0(2, this, false, false);
    }

    public static t0h E0(String str) {
        if (str == null) {
            return null;
        }
        return new t0h(str);
    }

    public static String H0(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strI0 = I0(obj, z);
        String strI1 = I0(obj2, z);
        String strI2 = I0(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strI0)) {
            sb.append(str2);
            sb.append(strI0);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strI1)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strI1);
        }
        if (!TextUtils.isEmpty(strI2)) {
            sb.append(str3);
            sb.append(strI2);
        }
        return sb.toString();
    }

    public static String I0(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof t0h) {
                return ((t0h) obj).a;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = w3h.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    @Override // defpackage.g5h
    public final boolean B0() {
        return false;
    }

    public final void F0(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(G0(), i)) {
            Log.println(i, G0(), H0(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        oa7.A(str);
        m3h m3hVar = ((w3h) this.b).g;
        if (m3hVar == null) {
            Log.println(6, G0(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!m3hVar.c) {
                Log.println(6, G0(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            m3hVar.J0(new q0h(this, i, str, obj, obj2, obj3));
        }
    }

    public final String G0() {
        String str;
        synchronized (this) {
            try {
                str = this.f;
                if (str == null) {
                    ((w3h) ((w3h) this.b).d.b).getClass();
                    str = "FA";
                    this.f = "FA";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
