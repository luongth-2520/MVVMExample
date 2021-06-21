package com.example.demomvvm.data.source.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.demomvvm.data.model.Pokemon;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class PokemonDAO_Impl implements PokemonDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Pokemon> __insertionAdapterOfPokemon;

  private final EntityDeletionOrUpdateAdapter<Pokemon> __deletionAdapterOfPokemon;

  public PokemonDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPokemon = new EntityInsertionAdapter<Pokemon>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Favorites_Pokemon` (`name`,`url`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Pokemon value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
      }
    };
    this.__deletionAdapterOfPokemon = new EntityDeletionOrUpdateAdapter<Pokemon>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Favorites_Pokemon` WHERE `name` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Pokemon value) {
        if (value.getName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getName());
        }
      }
    };
  }

  @Override
  public Object insert(final Pokemon pokemon, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPokemon.insert(pokemon);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final Pokemon pokemon, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfPokemon.handle(pokemon);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public List<Pokemon> getAllPokemons() {
    final String _sql = "SELECT * FROM Favorites_Pokemon";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final List<Pokemon> _result = new ArrayList<Pokemon>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Pokemon _item;
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        _item = new Pokemon(_tmpName,_tmpUrl);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Object isFavoritesPokemon(final String pokemonName,
      final Continuation<? super Boolean> p1) {
    final String _sql = "SELECT EXISTS(SELECT * FROM Favorites_Pokemon WHERE name = ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (pokemonName == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, pokemonName);
    }
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final Boolean _result;
          if(_cursor.moveToFirst()) {
            final Integer _tmp;
            if (_cursor.isNull(0)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getInt(0);
            }
            _result = _tmp == null ? null : _tmp != 0;
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
