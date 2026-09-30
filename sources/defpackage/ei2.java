package defpackage;

import com.adjust.sdk.Constants;
import io.sentry.android.core.b1;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ei2 {
    public static final Pattern e;
    public static final Pattern f;
    public final HashSet a = new HashSet();
    public final Executor b;
    public final wh2 c;
    public final wh2 d;

    static {
        Charset.forName(Constants.ENCODING);
        e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public ei2(Executor executor, wh2 wh2Var, wh2 wh2Var2) {
        this.b = executor;
        this.c = wh2Var;
        this.d = wh2Var2;
    }

    public static HashSet a(wh2 wh2Var) {
        HashSet hashSet = new HashSet();
        yh2 yh2VarC = wh2Var.c();
        if (yh2VarC != null) {
            Iterator<String> itKeys = yh2VarC.b.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }

    public final og5 b(String str) {
        String string;
        yh2 yh2VarC = this.c.c();
        String string2 = null;
        if (yh2VarC == null) {
            string = null;
        } else {
            try {
                string = yh2VarC.b.getString(str);
            } catch (JSONException unused) {
                string = null;
            }
        }
        if (string == null) {
            yh2 yh2VarC2 = this.d.c();
            if (yh2VarC2 != null) {
                try {
                    string2 = yh2VarC2.b.getString(str);
                } catch (JSONException unused2) {
                }
            }
            if (string2 != null) {
                return new og5(string2, 1);
            }
            b1.l("FirebaseRemoteConfig", "No value of type 'FirebaseRemoteConfigValue' exists for parameter key '" + str + "'.");
            return new og5("", 0);
        }
        yh2 yh2VarC3 = this.c.c();
        if (yh2VarC3 != null) {
            synchronized (this.a) {
                try {
                    Iterator it = this.a.iterator();
                    while (it.hasNext()) {
                        this.b.execute(new c0((zpb) it.next(), str, yh2VarC3, 7));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new og5(string, 2);
    }
}
