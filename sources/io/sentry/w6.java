package io.sentry;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w6 {
    public static final Pattern d = Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);
    public final io.sentry.protocol.w a;
    public final g7 b;
    public final Boolean c;

    public w6(String str) throws io.sentry.exception.b {
        Matcher matcher = d.matcher(str);
        if (!matcher.matches()) {
            throw new io.sentry.exception.b(str);
        }
        this.a = new io.sentry.protocol.w(matcher.group(1));
        this.b = new g7(matcher.group(2));
        String strGroup = matcher.group(3);
        this.c = strGroup == null ? null : Boolean.valueOf("1".equals(strGroup.substring(1)));
    }

    public final String a() {
        g7 g7Var = this.b;
        Boolean bool = this.c;
        io.sentry.protocol.w wVar = this.a;
        if (bool == null) {
            return wVar + "-" + g7Var;
        }
        return wVar + "-" + g7Var + "-" + (bool.booleanValue() ? "1" : "0");
    }

    public w6(io.sentry.protocol.w wVar, g7 g7Var, Boolean bool) {
        this.a = wVar;
        this.b = g7Var;
        this.c = bool;
    }
}
