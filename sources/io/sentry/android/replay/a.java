package io.sentry.android.replay;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import defpackage.bwe;
import defpackage.gu7;
import defpackage.rob;
import defpackage.x16;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends gu7 implements x16 {
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a v;
    public static final a w;
    public final /* synthetic */ int a;

    static {
        int i = 0;
        b = new a(i, 0);
        c = new a(i, 1);
        d = new a(i, 2);
        e = new a(i, 3);
        f = new a(i, 4);
        g = new a(i, 5);
        v = new a(i, 6);
        w = new a(i, 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.x16
    public final Object invoke() throws NoSuchFieldException {
        Method method;
        switch (this.a) {
            case 0:
                return new rob("_[a-z]");
            case 1:
                return new io.sentry.util.k();
            case 2:
                x xVar = new x();
                new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new bwe(22, xVar));
                return xVar;
            case 3:
                Class cls = (Class) e0.a.getValue();
                if (cls == null) {
                    return null;
                }
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            case 4:
                try {
                    return Class.forName("android.view.WindowManagerGlobal");
                } catch (Throwable th) {
                    Log.w("WindowManagerSpy", th);
                    return null;
                }
            case 5:
                Class cls2 = (Class) e0.a.getValue();
                if (cls2 == null || (method = cls2.getMethod("getInstance", null)) == null) {
                    return null;
                }
                return method.invoke(null, null);
            case 6:
                try {
                    return Class.forName("com.android.internal.policy.DecorView");
                } catch (Throwable th2) {
                    Log.d("WindowSpy", "Unexpected exception loading DecorView on API " + Build.VERSION.SDK_INT, th2);
                    return null;
                }
            default:
                Class cls3 = (Class) j0.a.getValue();
                if (cls3 == null) {
                    return null;
                }
                try {
                    Field declaredField2 = cls3.getDeclaredField("mWindow");
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException e2) {
                    Log.d("WindowSpy", "Unexpected exception retrieving " + cls3 + "#mWindow on API " + Build.VERSION.SDK_INT, e2);
                    return null;
                }
        }
    }
}
