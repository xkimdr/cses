module Main where

f :: Int -> [String]
f n = if n == 1 then [] else show m : f m
  where
    m = if even n then div n 2 else n * 3 + 1

main = do
  s <- getLine
  let n = read s :: Int
  putStrLn (unwords (show n : f n))