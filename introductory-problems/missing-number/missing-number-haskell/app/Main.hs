module Main where

f :: String -> String -> Int
f a b = div (n * (n + 1)) 2 - sum (map read (words b))
  where
    n = read a

main :: IO ()
main = do
  a <- getLine
  b <- getLine
  print (f a b)
