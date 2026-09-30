package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sh9 {
    public static final sh9 a;
    public static final sh9 b;
    public static final sh9 c;
    public static final /* synthetic */ sh9[] d;

    static {
        sh9 sh9Var = new sh9("SystemNotificationsEnabled", 0);
        a = sh9Var;
        sh9 sh9Var2 = new sh9("RequestRuntimePermission", 1);
        b = sh9Var2;
        sh9 sh9Var3 = new sh9("OpenAndroidAppNotificationSettings", 2);
        c = sh9Var3;
        d = new sh9[]{sh9Var, sh9Var2, sh9Var3};
    }

    public static sh9 valueOf(String str) {
        return (sh9) Enum.valueOf(sh9.class, str);
    }

    public static sh9[] values() {
        return (sh9[]) d.clone();
    }
}
