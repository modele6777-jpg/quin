package io.sentry.util;

import com.adjust.sdk.Constants;
import io.sentry.k2;
import io.sentry.m1;
import io.sentry.q5;
import io.sentry.z0;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static final Charset a = Charset.forName(Constants.ENCODING);

    public static long a(m1 m1Var, z0 z0Var, k2 k2Var) {
        try {
            c cVar = new c();
            m1Var.a(cVar, k2Var);
            return cVar.a;
        } catch (Throwable th) {
            z0Var.d(q5.ERROR, "Could not calculate size of serializable", th);
            return 0L;
        }
    }

    public static HashMap b(Calendar calendar) {
        HashMap map = new HashMap();
        map.put("year", Integer.valueOf(calendar.get(1)));
        map.put("month", Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        map.put("minute", Integer.valueOf(calendar.get(12)));
        map.put("second", Integer.valueOf(calendar.get(13)));
        return map;
    }
}
