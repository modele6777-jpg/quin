package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iwf extends kwf {
    public static iwf c;
    public static final pzd d = new pzd(10);
    public final Application b;

    public iwf(Application application) {
        this.b = application;
    }

    @Override // defpackage.kwf, defpackage.jwf
    public final ewf a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        s8f.i("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.kwf, defpackage.jwf
    public final ewf b(Class cls, m69 m69Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) m69Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!cx.class.isAssignableFrom(cls)) {
            return eb3.G(cls);
        }
        qc0.j("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final ewf d(Class cls, Application application) {
        if (!cx.class.isAssignableFrom(cls)) {
            return eb3.G(cls);
        }
        try {
            ewf ewfVar = (ewf) cls.getConstructor(Application.class).newInstance(application);
            ewfVar.getClass();
            return ewfVar;
        } catch (IllegalAccessException e) {
            cva.p("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            cva.p("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            cva.p("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            cva.p("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}
