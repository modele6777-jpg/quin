package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class iob extends jy4 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iob(int i) {
        super(22);
        this.b = i;
    }

    @Override // defpackage.jy4
    public String n(Method method, int i) {
        switch (this.b) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (!parameter.isNamePresent()) {
                    return super.n(method, i);
                }
                return "parameter '" + parameter.getName() + '\'';
            default:
                return super.n(method, i);
        }
    }

    @Override // defpackage.jy4
    public final Object p(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.b) {
            case 0:
                break;
        }
        return tq.D(method, cls, obj, objArr);
    }

    @Override // defpackage.jy4
    public final boolean r(Method method) {
        switch (this.b) {
            case 0:
                break;
        }
        return method.isDefault();
    }
}
