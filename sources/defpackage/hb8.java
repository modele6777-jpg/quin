package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class hb8 {
    public static final b1b a;

    static {
        Object dzbVar;
        try {
            ClassLoader classLoader = kdc.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof b1b) {
                        dzbVar = (b1b) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof dx3)) {
                    i++;
                }
                dzbVar = null;
                break;
            }
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        b1b pr4Var = (b1b) (dzbVar instanceof dzb ? null : dzbVar);
        if (pr4Var == null) {
            pr4Var = new pr4(1, new ov7(16));
        }
        a = pr4Var;
    }
}
