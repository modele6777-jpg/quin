package defpackage;

import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import io.sentry.android.navigation.SentryNavigationListener;
import io.sentry.e1;
import io.sentry.g4;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rl2 implements ObjectConstructor, yn2, g4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ rl2(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return ConstructorConstructor.lambda$newUnsafeAllocator$20(str);
            case 1:
                return ConstructorConstructor.lambda$newDefaultConstructor$7(str);
            case 2:
                return ConstructorConstructor.lambda$newDefaultConstructor$8(str);
            case 3:
                return ConstructorConstructor.lambda$get$2(str);
            case 4:
                return ConstructorConstructor.lambda$get$3(str);
            default:
                return ConstructorConstructor.lambda$get$4(str);
        }
    }

    @Override // io.sentry.g4
    public void g(e1 e1Var) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 7:
                e1Var.z(str);
                break;
            case 8:
                e1Var.getClass();
                e1Var.z(str);
                break;
            default:
                int i2 = SentryNavigationListener.g;
                e1Var.getClass();
                e1Var.z(str);
                break;
        }
    }

    @Override // defpackage.yn2
    public Object h(Task task) throws ExecutionException {
        if (!task.m()) {
            throw new ExecutionException(task.h());
        }
        String str = (String) task.i();
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.b;
            if (str.endsWith(str2)) {
                return str2;
            }
        }
        throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
    }
}
