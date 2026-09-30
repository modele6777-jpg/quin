package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j91 {
    public final Locale a;
    public final LinkedHashMap b = new LinkedHashMap();

    public j91(Locale locale) {
        this.a = locale;
    }

    public abstract n91 a(long j);

    public abstract c91 b();

    public abstract c91 c(String str, String str2, Locale locale);
}
