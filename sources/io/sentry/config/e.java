package io.sentry.config;

import defpackage.ks0;
import io.sentry.util.p;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements d {
    public final String a;
    public final Properties b;

    public e(String str, Properties properties) {
        this.a = str;
        io.sentry.util.b.r(properties, "properties are required");
        this.b = properties;
    }

    @Override // io.sentry.config.d
    public final Map c() {
        String strL = ks0.l(new StringBuilder(), this.a, "tags.");
        HashMap map = new HashMap();
        for (Map.Entry entry : this.b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(strL)) {
                    map.put(str.substring(strL.length()), p.d((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.d
    public final String getProperty(String str) {
        return p.d(this.b.getProperty(this.a + str));
    }

    public e(Properties properties) {
        this("", properties);
    }
}
