package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jy8 {
    public static final Set d = Collections.unmodifiableSet(new HashSet(Arrays.asList("token", "time", "distinct_id", "$device_id", "$user_id", "$had_persisted_distinct_id")));
    public final gb5 a;
    public final String b;
    public final Set c;

    public jy8(gg7 gg7Var) {
        this.b = (String) gg7Var.c;
        this.a = (gb5) gg7Var.b;
        this.c = (Set) gg7Var.d;
    }
}
