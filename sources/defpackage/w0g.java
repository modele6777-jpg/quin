package defpackage;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w0g {
    public static final z0g a;

    static {
        z0g qk6Var;
        try {
            qk6Var = new vrb(10, (WebViewProviderFactoryBoundaryInterface) g21.y(WebViewProviderFactoryBoundaryInterface.class, aic.j()));
        } catch (ClassNotFoundException unused) {
            qk6Var = new qk6(16);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            yg5.p(e);
            return;
        }
        a = qk6Var;
    }
}
