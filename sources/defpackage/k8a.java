package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k8a {
    public static final Pattern a = Pattern.compile("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*");
    public static final cl2[] b = cl2.values();

    public static void b(String str, String str2) {
        if (str == null || str.length() == 0) {
            qc0.j("Attribute key must not be null or empty");
            return;
        }
        if (str2 == null || str2.length() == 0) {
            qc0.j("Attribute value must not be null or empty");
            return;
        }
        if (str.length() > 40) {
            Locale locale = Locale.US;
            qc0.j("Attribute key length must not exceed 40 characters");
        } else if (str2.length() > 100) {
            Locale locale2 = Locale.US;
            qc0.j("Attribute value length must not exceed 100 characters");
        } else {
            if (a.matcher(str).matches()) {
                return;
            }
            qc0.j("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    public static String c(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            Locale locale = Locale.US;
            return "Metric name must not exceed 100 characters";
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (cl2 cl2Var : b) {
            if (cl2Var.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    public abstract boolean a();
}
