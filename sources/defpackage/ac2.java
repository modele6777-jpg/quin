package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import io.sentry.android.core.b1;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ac2 implements i1b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ac2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.i1b
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
                    }
                    throw new bb7("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    b1.l("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e) {
                    throw new bb7(ib8.j("Could not instantiate ", str, "."), e);
                } catch (InstantiationException e2) {
                    throw new bb7(ib8.j("Could not instantiate ", str, "."), e2);
                } catch (NoSuchMethodException e3) {
                    throw new bb7(ub3.i("Could not instantiate ", str), e3);
                } catch (InvocationTargetException e4) {
                    throw new bb7(ub3.i("Could not instantiate ", str), e4);
                }
            case 1:
                return (ComponentRegistrar) obj;
            default:
                return new wu6((ff5) obj);
        }
    }
}
