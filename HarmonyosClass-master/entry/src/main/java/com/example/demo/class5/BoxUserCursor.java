package com.example.demo.class5;

import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * ObjectBox generated Cursor implementation for "BoxUser".
 * Note that this is a low-level class: usually you should stick to the Box class.
 */
public final class BoxUserCursor extends Cursor<BoxUser> {
    @Internal
    static final class Factory implements CursorFactory<BoxUser> {
        @Override
        public Cursor<BoxUser> createCursor(io.objectbox.Transaction tx, long cursorHandle, BoxStore boxStoreForEntities) {
            return new BoxUserCursor(tx, cursorHandle, boxStoreForEntities);
        }
    }

    private static final BoxUser_.BoxUserIdGetter ID_GETTER = BoxUser_.__ID_GETTER;


    private final static int __ID_userId = BoxUser_.userId.id;
    private final static int __ID_userName = BoxUser_.userName.id;

    public BoxUserCursor(io.objectbox.Transaction tx, long cursor, BoxStore boxStore) {
        super(tx, cursor, BoxUser_.__INSTANCE, boxStore);
    }

    @Override
    public final long getId(BoxUser entity) {
        return ID_GETTER.getId(entity);
    }

    /**
     * Puts an object into its box.
     *
     * @return The ID of the object within its box.
     */
    @Override
    public final long put(BoxUser entity) {
        String userName = entity.userName;
        int __id2 = userName != null ? __ID_userName : 0;

        long __assignedId = collect313311(cursor, entity.id, PUT_FLAG_FIRST | PUT_FLAG_COMPLETE,
                __id2, userName, 0, null,
                0, null, 0, null,
                __ID_userId, entity.userId, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, 0, 0);

        entity.id = __assignedId;

        return __assignedId;
    }

}
